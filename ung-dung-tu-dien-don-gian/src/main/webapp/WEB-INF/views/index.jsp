<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Từ điển Anh - Việt</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light text-dark">

<div class="container mt-5">
    <div class="card mx-auto shadow" style="max-width: 500px;">
        <div class="card-body text-center">
            <h2 class="card-title text-primary mb-4">Từ điển Anh - Việt</h2>
            <form action="translate" method="post">
                <div class="mb-3 text-start">
                    <label for="keyword" class="form-label fw-bold">Nhập từ tiếng Anh:</label>
                    <input type="text" id="keyword" name="keyword" class="form-control" placeholder="Ví dụ: hello" required>
                </div>
                <button type="submit" class="btn btn-success w-100">Tra cứu</button>
            </form>

            <% if (request.getAttribute("message") != null) { %>
            <p class="text-danger fw-bold mt-3">${message}</p>
            <% } %>
        </div>
    </div>
</div>

</body>
</html>
