package ch05.package_exam;

import ch05.package_exam.hankook.SnowTire;
import ch05.package_exam.kia.Engine;
import ch05.package_exam.kumho.*;


public class CarExam0526 {
	public String company;
	public String model;
	
	//한국 타이어 객체 생성
	ch05.package_exam.hankook.Tire tire1= 
			new ch05.package_exam.hankook.Tire();
	
	//금호 타이어 객체 생성
	Tire  tire2 = new Tire();
	
	//기아 엔진 객체 생성(import 확인)
	Engine kiaengine = new Engine();
	
	
	BigwidthTire bigwidthtire = new BigwidthTire();
	SnowTire snowtire = new SnowTire();
	SportsTire sportstire = new SportsTire();
	
	
	
}
