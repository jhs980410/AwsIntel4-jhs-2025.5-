<%@ page language="java" contentType="text/html; charset=UTF-8
	"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <title>폼</title>   
</head>
<body>   
    <form action="#" method="post">
        <fieldset>
            <legend>type 속성</legend>
            <p>아이디 : <input type="text"></p>
            <p>비밀번호 : <input type="password"></p>
            <p>검색 : <input type="search"></p>
            <p>이메일 : <input type="email"></p>
            <p>전화번호 : <input type="tel"></p>
            <p>컬러선택 : <input type="color"></p>
            <p>수량 : <input type="number" min="1" max="10" value="1"></p>
            <p>만족도 : <input type="range" min="1" max="10" value="1"></p>
            <p>예<input type="radio" name="receive" checked="checked"> 아니오<input type="radio" name="receive"></p>
            <p>html<input type="checkbox" checked="checked"> css<input type="checkbox"></p>
            <p><input type="submit" value="전송"></p>
            <p><input type="reset" value="취소"></p>
            <p><input type="button" value="확인"></p>
            <p><input type="image"  src="images/bt.png" alt="전송"></p>
            <p><input type="file"></p>                       
        </fieldset>
    </form>
</body>
</html>