<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<main id="main" class="main">
                <h1 class="d-none">메인이다</h1>
                <section>
                    <div class="">
                        <table border="1">
                        <thead>
                           <tr>
	                           <td>번호</td>
	                           <td>제목</td>
	                           <td>작성자</td>
	                           <td>분야</td>
	                           <td>기술</td>
	                           <td>언어</td>
	                           <td>요구사항</td>
	                           <td>등록일</td>
	                           <td>내용</td>
                           </tr>
                         </thead>
                         
                         <tbody>
							<tr>
								<td>${pj.id}</td>
								<td>${pj.title}</td>
								<td>${pj.leaderId }</td>
								<td></td>
								<td></td>
								<td></td>
								<td>${pj.requirement }</td>
								<td>
								<fmt:formatDate value="${pj.regDate }" pattern="yyyy-MM-dd"/>
								</td>
								<td>${pj.content }</td>
							</tr>
                         </tbody>
                        </table>
                    </div>
                </section>
                
                <div class="pager">
                    <div>
                    <a href="#"><i class="fas fa-angle-double-left"></i></a>
                    </div>
                    <div>
                    <a href="#"><i class="fas fa-angle-left"></i></a>
                    </div>
                    <ul>
                    <li><a href="#">1</a></li>
                    </ul>
                    <div>
                    <a href="#"><i class="fas fa-angle-right"></i></a>
                    </div>
                    <div>
                    <a href="#"><i class="fas fa-angle-double-right"></i></a>
                    </div>
                </div>
                
            </main>