package icehs.science.chapter07;

public class Movie {
	String title;
	String director;
	String genrs;
	
	Movie(){
	}
	
	Movie(String title, String director){
		this.title = title;
		this.director = director;
	}
	
	Movie(String title, String director, String genrs){
		this.title = title;
		this.director = director;
		this.genrs = genrs;
	}
	
	void printMovieInfo(){
		System.out.println("제목 : " + title);
		System.out.println("감독 : " + director);
		System.out.println("장르 : " + genrs);
	}
	
}
