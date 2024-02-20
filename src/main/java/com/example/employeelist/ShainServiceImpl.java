package com.example.employeelist;

public class ShainServiceImpl implements ShainService {

	@Override
	public String findByNo(String number) {
		// リポジトリから社員を選択
		ShainRepository shainRepository = new ShainRepositoryImpl();
		String name = shainRepository.selectByNo(number);
		return name;
	}

}
