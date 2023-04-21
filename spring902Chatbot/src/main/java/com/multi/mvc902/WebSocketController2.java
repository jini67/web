package com.multi.mvc902;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController2 {

	@MessageMapping("/chat2")
	@SendTo("/topic/messages2")
	public OutputMessage2 send2(Message message) {
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "챗 봇>>  10) 요즘 인기있는 공연, 축제  		11) 후기관련			12) 휠체어석";
			break;
		case "2":
			menu = "챗 봇>>  20) 결제방법	21) 티켓수령안내	22) 취소/환불";
			break;
		case "3":
			menu = "챗 봇>>  30) 회원가입	31) 회원탈퇴	32) 회원정보 변경	33) 아이디/비밀번호 분실";
			break;
		case "4":
			menu = "챗 봇>>  40) 이벤트		41) 문화비 소득공제	42) 현금영수증 발급";
			break;
			
			
		case "10":
			menu = "챗 봇>> 공연, 축제 메뉴에서 인기순으로 검색하시면 해당 정보를 확인하실 수 있습니다.";
			break;
		case "11":
			menu = "챗 봇>>  - 행사포스터 클릭 후 하단에서 확인하실 수 있습니다.\n" + 
					"- 해시태그 검색 메뉴에서 SNS에 올라온 실시간 후기들도 확인하실 수 있습니다.";
			break;
		case "12":
			menu = "챗 봇>>  해당 공연 공연장에 문의해 주시길 바랍니다.";
			break;
			
			
		case "20":
			menu = "챗 봇>>  신용카드결제, 무통장입금";
			break;
		case "21":
			menu = "챗 봇>>  - 공연 당일 현장 교부처에서 예약번호 및 본인 확인 후 티켓을 수령하실 수 있습니다.\n" + 
					"- 상단 예매확인/취소 메뉴에서 예매내역을 프린트하여 가시면 편리합니다.";
			break;
		case "22":
			menu = "챗 봇>>   My티켓 > 예매/취소내역에서 직접 취소 또는 고객센터 (0000-0000)를 통해서 예매를 취소할 수 있습니다.";
			break;
		default:
			menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		OutputMessage2 outputMessage2 = new OutputMessage2(menu);
		return outputMessage2;
	}
	
	//ws프로토콜로 요청을 받음.
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(Message message) {
		System.out.println("서버에서 받은 데이터>> " + message); //서버에서 받은 클라이언트의 채팅 내용을 확인 
		Date date = new Date(); //java.util.Date;
		int hour = date.getHours();//시 
		int min = date.getMinutes();//분 
		String time = hour + ":" + min;
		//채팅방에 들어와있는 모든 클라이언트에게 보낼 데이터 
		OutputMessage output = new OutputMessage(message.getFrom(), message.getText(), time);
		return output; //return데이터는 json으로 만들어서 클라이언트 브라우저에 보냄.
		//jackson-databind
	}
}
