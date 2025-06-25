<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">

</head>
<body>
<form action="save" method="post">
    <div class="mb-3">
        <label for="nameId" class="form-label">Full Name</label>
        <input type="text" class="form-control" name="fullName"  id="nameId" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
        <label for="emailID" class="form-label">Email address</label>
        <input type="email" class="form-control" name="email" id="emailID" aria-describedby="emailHelp">

    </div>
    <div class="mb-3">
        <label for="phoneId" class="form-label">Phone Number</label>
        <input type="number"  name="phone" class="form-control" id="phoneId" aria-describedby="emailHelp">

    </div>

    <div class="mb-3">
        <label for="religion" class="form-label">Religion</label>
        <input type="text" class="form-control" id="religion" name="religion" aria-describedby="emailHelp">

    </div>
    <div class="mb-3">
        <label for="ageId" class="form-label">Age</label>
        <input type="number" class="form-control" name="age" id="ageId" aria-describedby="emailHelp">

    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1">
    </div>

    <button type="submit"  class="btn btn-primary">Submit</button>
</form>
</body>
</html>