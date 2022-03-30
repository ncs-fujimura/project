package com.example.base;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author fujimura
 *
 * Serviceクラスで共通で持つ機能を定義します
 * 各機能のServiceクラスは、原則当クラスを継承してください。
 */
@Service
public class BaseService {
	
	@Autowired
	protected HttpSession session;
	

}
