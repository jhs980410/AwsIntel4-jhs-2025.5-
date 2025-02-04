<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>6x11 테이블</title>
<style>
table {
	width: 100px margin-bottom: 20px;
}

table, th, td {
	border: 1px none black;
}

th, td {
	padding: 10px;
	text-align: center;
}

.row1 td:first-child {
	background-color: gray;
	text-align: left;
	width: 300px;
}

.row1 td:nth-child(2) {
	background-color: gray;
	text-align: center;
	padding: 1px;
	width: 20px;
}

.more_cell {
	border-left: 4px solid white; /* 왼쪽에 경계선 추가 */
	border-right: 4px solid white; /* 오른쪽에 경계선 추가 */
	background-color: #f0f0f0; /* 'more' 부분 배경색 */
}

.first {
	float: left;
	margin-right: 60px;
}
</style>
</head>
<body>

	<!-- 첫 번째 테이블 (자유게시판 관련) -->
	<div class="first">
		<table>
			<tr class="row1">
				<td colspan="5">자유게시판</td>
				<td class="more-cell">more</td>
			</tr>
			<tr>
				<td colspan="5">자유게시판컨텐츠1</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">자유게시판컨텐츠2</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">자유게시판컨텐츠3</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">자유게시판컨텐츠4</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">자유게시판컨텐츠5</td>
				<td>10</td>
			</tr>
		</table>
	</div>


	<div class="right">
		<table>
			<tr class="row1">
				<td colspan="5">모집공고</td>
				<td class="more-cell">more</td>
			</tr>
			<tr>
				<td colspan="5">모집공고 컨텐츠1</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">모집공고 컨텐츠2</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">모집공고 컨텐츠3</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">모집공고 컨텐츠4</td>
				<td>10</td>
			</tr>
			<tr>
				<td colspan="5">모집공고 컨텐츠5</td>
				<td>10</td>
			</tr>
		</table>
	</div>


</body>
</html>
