<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Kết quả tra cứu</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light text-dark">

<div class="container mt-5">
  <div class="card mx-auto shadow" style="max-width: 500px;">
    <div class="card-body text-center">
      <h2 class="card-title text-primary mb-4">Kết quả tra cứu</h2>

      <p class="mb-3"><strong>Từ tiếng Anh:</strong> ${keyword}</p>
      <p class="fs-5 text-success fw-bold">Nghĩa tiếng Việt: ${meaning}</p>

      <a href="/" class="btn btn-primary mt-4">Tra cứu từ khác</a>
    </div>
  </div>
</div>

</body>
</html>
