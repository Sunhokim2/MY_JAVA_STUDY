package icehs.science.workshop3.book;



public class BookArrayTest {
    
    public static void main( String[] args ) {
    	
        //책 배열을 만들고 아래와 책을 생성해서 책배열에 저장하시오.
    	
    	new Book( "조선 실록의 세계", "오항녕" );
        new Book( "이공계 글쓰기", "유키 히로시" );
        new Book( "9788946061392", "인권을 찾아서", "조호제", 19500 );
        new Book( "9788964150719", "인문학 따라 쓰기", "고정욱", 14800 );
        new Book( "9791186561188", "혼자가 되는 책들", "최원호", 15000, "2016-02-29" );
        new Book( "9788954637169", "법륜 스님의 행복", "법류", 14000, "2016-01-25" );
        new Book( "9791185392080", "하버드 새벽 4시반", "웨이슈잉", 14000, "2014-12-29" );
        
        System.out.println( ">> 도서출력" );
        
        
        System.out.println( "\n>> 가격이 15000원 이하인 도서 찾기" );
        
        
        System.out.println( "\n>> ISBN 번호가 9788964150719인 도서 구매하기" );
        
        
        
        
    }
}