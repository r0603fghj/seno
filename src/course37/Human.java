package course37;

//ICharacterインタフェースを実装するクラス
class Human implements ICharacter {
	private String name;
	private String type;
	private String job;
	private int speed;

	/*
	各種フィールドを以下のように初期化するコンストラクタ
	nameは「ななしさん」
	speedは「16」
	typeは「人間」
	jobは「なし」
	*/
	Human() {
		xxxxxxxx
		xxxxxxxx
		xxxxxxxx
		xxxxxxxx
	}

	/*
	ICharacterからの実装を行います
	メソッドの処理を参考にして適切なメソッドをオーバーライドしてください
	*/
	@Override
	xxxxxxxx {
		this.name = name;
	}

	@Override
	xxxxxxxx {
		return name;
	}

	@Override
	xxxxxxxx {
		return type;
	}

	@Override
	xxxxxxxx {
		System.out.println("タイプ：" + type);
		System.out.println("名前：" + name);
		System.out.println("職業：" + job);
		System.out.println("走る速度：" + speed + "km/h");
	}

	@Override
	xxxxxxxx {
		if (value >= -5 && value <= 10)
			speed = (int) (speed * (1 + (0.1 * value)));
	}

	public void setJob(String j) {
		job = j;
	}
}