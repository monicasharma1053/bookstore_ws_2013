package com.bookservices;

import javax.jws.WebService;
import javax.jws.WebParam;
import com.bean.Book;

@WebService
public interface AuthService {
	Book getAuthor(@WebParam(name="gid") String gid); 

}
