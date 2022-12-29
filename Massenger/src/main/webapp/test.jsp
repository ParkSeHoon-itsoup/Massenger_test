<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width initial-scale=1">
<meta charset="UTF-8">
<title>BBS</title>
</head>
<body>
    <div class="container">
        <div class="col-lg-4"></div>
        <div class="col-lg-4">
            <!--점보트로은 특정 컨텐츠, 정보를 두드러지게 하기 위한 큰 박스-->
            <div class="jumbtron" style="padding-top:20px;">
                <form method="post" action="TestAction.jsp">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="userID" id="userID" name="userID" maxlength="20">
                    </div>
                    <input type="submit" class="btn btn-primary form-control" value="조회">
                </form>
             </div>
        </div>
    </div>
    <div class="col-lg-4"></div>
</body>
</html>