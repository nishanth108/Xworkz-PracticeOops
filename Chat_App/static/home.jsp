<html xmlns="http://www.w3.org/1999/html">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>


</head>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="#">upload</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" aria-disabled="false">profile</a>
                </li>
            </ul>
            <li class="d-flex nav-item mr-r-2" >
                <a class="nav-link active" aria-disabled="false">Setting</a>
            </li>
        </div>
    </div>
</nav>

<div class="container " >

    <form>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Name :</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>



    <section class="section2">
        <div class="card" style="width: 18rem;">
            <form action="home" method="post">
                <labe for="nameId">
                    name:
                </labe>
                <input type="text" name="userName" id="nameId">
                <br>
                <br>
                <labe for="emailId">
                    email:
                </labe>
                <input type="email" name="userEmaile" id="emailId">
                <br>
                <br>


                <labe for="phoneNo">
                    Phone Number:
                </labe>
                <input type="number" name="phone" id="phoneNo">
                <br>
                <br>

                <labe for="address">
                    address:
                </labe>
                <input type="text" name="userAddress" id="address">
                <br>
                <br>

                <labe for="Addhar">
                    Addhar:
                </labe>
                <input type="text" name="userAddhar" id="Addhar">
                <br>
                <br>


                <labe for="college">
                    College Name:
                </labe>
                <input type="text" name="collegeName" id="college">
                <br>
                <br>


                <labe for="relationship">
                    RelationShip:
                </labe>
                <input type="text" name="relationshipStatus" id="relationship">
                <br>
                <br>


                <labe for="salary">
                    Salary:
                </labe>
                <input type="number" name="userSalary" id="salary">


                <div class="buttons">
                    <button type="submit">Sumbit</button>
                </div>
            </form>
        </div>
    </section>
</div>