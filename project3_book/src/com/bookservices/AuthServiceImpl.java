package com.bookservices;

import javax.jws.WebService;

import com.bean.Book;
import com.dao.BookDAO;

@WebService(endpointInterface = "com.company.auth.service.AuthService", serviceName = "corporateAuthService")
public class AuthServiceImpl implements AuthService {

	public Book getAuthor(String gid) {
		BookDAO dao = new BookDAO();
		return dao.getAuthor(gid);
	}
	
	

}