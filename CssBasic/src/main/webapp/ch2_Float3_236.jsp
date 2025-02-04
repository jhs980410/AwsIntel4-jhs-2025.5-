<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>float</title>
<style type="text/css">
h1, p, ul {
	margin: 0;
	padding: 0;
}

li {
	list-style-type: none;
}

.gallery {
	padding: 0;
}

.gallery li {
	float: left;
	width: 150px;
	margin-right: 10px;
	text-align: center;
}

.gallery h3 {
	padding: 5px;
}

.gallery li h3 {
	background: #daa;
}

.gallery li+li h3 {
	background: #abc;
}

.gallery li+li+li h3 {
	background: #eba;
}

.gallery li+li+li+li h3 {
	background: #aa7;
}

.gallery li p {
	padding: 10px;
	text-align: justify;
	font-size: 14px;
}

.title{
	margin : auto;
	background-color: gray;
	text-align: center;
	padding: 10px;
}

.fixed-gallery {
	position: fixed;  /* 왼쪽 상단에 고정 */
	top: 0;
	left: 0;
	width: 200px;
	background-color: #f0f0f0;
	padding: 10px;
	border: 1px solid #ccc;
}

.gallery {
	margin-top: 120px; /* 고정된 갤러리 아래에 여백 추가 */
}

</style>
</head>
<body>

<!-- 고정된 꽃목록 -->
<div class="fixed-gallery">
	<h3>꽃 목록</h3>
	<ul class="gallery">
		<li><h3>튤립</h3>
			<p>너무 화려하지 않으며 고귀한 느낌을 가지고 있다. 붉은 색이 단연 으뜸이며 한 송이만 있어도 빼어나다.</p></li>
		<li><h3>제비꽃</h3>
			<p>드물게 푸른색을 띠고 있으며 작지만 시원해 보이는 어린 꽃이라고 할 수 있다. 여럿이 함께 있을 때 더욱 아름답다.</p></li>
		<li><h3>호박꽃</h3>
			<p>색도 모양도 화려하며 이름과 걸맞지 않게 아름다운 꽃으로 매우 완숙한 이미지를 풍기는 꽃이다.</p></li>
		<li><h3>해바라기</h3>
			<p>태양만 바라보는 일편단심의 꽃으로 얼굴이 큰 편에 속하며 송이가 적어야 제격이다.</p></li>
		<li><h3>장미</h3>
			<p>전 세계에서 가장 많이 사랑받는 꽃 중 하나로, 사랑과 열정을 상징한다.</p></li>
		<li><h3>국화</h3>
			<p>가을에 피는 대표적인 꽃으로, 우아하고 단정한 인상을 준다.</p></li>
		<li><h3>난초</h3>
			<p>고급
