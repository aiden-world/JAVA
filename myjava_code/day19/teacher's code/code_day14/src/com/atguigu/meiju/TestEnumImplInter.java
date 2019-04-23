package com.atguigu.meiju;

/*
 * 枚举实现接口（了解）
 */
public class TestEnumImplInter {
	public static void main(String[] args) {
		Gender g1 = Gender.MAN;
		g1.walk();
		
		System.out.println(g1.getDes());
	}
}
interface Walkable{
	void walk();
}
/*enum Gender implements Walkable{
	MAN,
	WOMAN;

	@Override
	public void walk() {
		System.out.println("走路");
	}
}*/

/*enum Gender implements Walkable{
	MAN{
		@Override
		public void walk() {
			System.out.println("大步流星");
		}
	},
	WOMAN{
		@Override
		public void walk() {
			System.out.println("婀娜多姿");
		}
	};

}*/

enum Gender implements Walkable{
	MAN("男"){
		@Override
		public void walk() {
			System.out.println("大步流星");
		}
	},
	WOMAN("女"){
		@Override
		public void walk() {
			System.out.println("婀娜多姿");
		}
	};
	
	private String des;

	private Gender(String des) {
		this.des = des;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}