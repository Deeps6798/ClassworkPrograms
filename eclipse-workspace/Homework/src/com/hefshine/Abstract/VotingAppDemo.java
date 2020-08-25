package com.hefshine.Abstract;

import java.util.Scanner;

import com.hefshine.Abstract.VotingApp.Kids;

public class VotingAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Kids k= new Kids();
		k.age=13;
		k.registerUser();
		k.votingnumber();
		Adult a= new Adult();
		//a.age=28;
		a.registerUser();
		
		a.votingnumber();
		

	}

}
