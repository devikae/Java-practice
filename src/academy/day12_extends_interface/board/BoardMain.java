package day12_extends_interface.board;

public class BoardMain {
	public static void main(String[] args) {
		Board board = new Board(1, "첫번째 게시글", "1등이닭", "ikae"); // 게시물 
		System.out.println(board.toString());
		
		// 만약 중고 거래 게시판이라면 
		// 위 게시판 내용을 그대로 가지고 있으면서
		// 필드에  +제품이미지  +제품가격 
		TradeBoard trade = new TradeBoard(1, "(270)나이키 포스 팝니다", "선제", "minwoo", "나이키신발.jpg", 100000);
		System.out.println(trade.toString());
		
		// 동영상 게시판이라면 
		// 필드에 동영상 링크
		
		VideoBoard video = new VideoBoard(1, "찬웅쌤 매드무비", "펜타킬ㄷㄷ", "akow283", "https://www,youtube.com");
		System.out.println(video.toString());
		
	}
}
