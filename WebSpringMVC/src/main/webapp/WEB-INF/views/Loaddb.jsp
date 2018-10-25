<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html lang="">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title Page</title>

    <!-- Bootstrap CSS -->
    <link href="bootstrap.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>

<body>
    <div class="container-fluid">

        <div class="container">

            <table class="table table-bordered table-hover"  id="t1">
                <thead>
                    <tr> 
                        <th>stt</th>
                        <th>id </th>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Node </th>
                        <th>Update</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    
                    <c:forEach var="cus" items="${listcus}" varStatus="loop">
                        <tr class="onRow">
                            <td><c:out value="${loop.index}" /></td>
                            <td>
                                <c:out value="${cus.getCustomerID()}" />
                            </td>
                            <td>
                                <c:out value="${cus.getName()}" />
                            </td>
                            <td>
                                <c:out value="${cus.getPhone()}" />
                            </td>
                            <td>
                                <c:out value="${cus.getEmail()}" />
                            </td>
                            <td>
                                <c:out value="${cus.getAddress()}" />
                            </td>
                            <td>
                                <c:out value="${cus.getNote()}" />
                            </td>
                            <td><button class="btn btn-warning" data-toggle="modal" href='#modal-id' id="update" >UPDATE</button></td>
                            <td><button class="btn btn-danger">DELETE</button></td>
                        </tr>
                
                    </c:forEach>
                </tbody>
            </table>

        </div>

    </div>
      
      <div class="modal fade" id="modal-id">
          <div class="modal-dialog">
              <div class="modal-content">
                  <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      <h4 class="modal-title">Modal title</h4>
                  </div>
                  <div class="modal-body">
                      
                      <label for="input-id" class="col-sm-2" >Id</label>
                      <input type="text" class="form-control" id="id">
                      <label for="input-name" class="col-sm-2">Name</label>
                      <input type="text" class="form-control" id="name">
                      <label for="input-phone" class="col-sm-3">Phone</label>
                      <input type="text" class="form-control" id="phone">
                      <label for="input-email" class="col-sm-2">Email</label>
                      <input type="text" class="form-control" id="email">
                      <label for="input-node" class="col-sm-2">Adress</label>
                      <input type="text" class="form-control" id="adress">
                      <label for="input-date" class="col-sm-2">Node</label>
                      <input type="text" class="form-control" id="node">
                      
                  </div>
                  <div class="modal-footer">
                      <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                      <button type="button" class="btn btn-primary">Save changes</button>
                  </div>
              </div>
          </div>
      </div>
     
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
     var data=[];var item;
     $("#t1 tr").each(function(){
         let id=$(this).find("td").eq(1).text().trim();
         let name= $(this).find("td").eq(2).text().trim();
        let phone= $(this).find("td").eq(3).text().trim();
        let email= $(this).find("td").eq(4).text().trim();
        let adress= $(this).find("td").eq(5).text().trim();
        let node=$(this).find("td").eq(6).text().trim();
       let array={id:id,name:name,phone:phone,email:email,adress:adress,node:node};
       data.push(array);
     });
 
     $(document).ready(function(){
      $(".btn-warning").click(function(){
          $('#t1 tr').click(function (e) {
              let so = $(this).closest('.onRow').find('td:nth-child(1)').text();
               item=parseInt(so)+1;
              $("#id").val(data[item].id);
              $("#name").val(data[item].name);
              $("#phone").val(data[item].phone);
              $("#email").val(data[item].email);
              $("#adress").val(data[item].adress);
              $("#node").val(data[item].node);
         
          });

      });
       $(".btn-primary").click(function () {
             let id = $("#id").val();
             let name = $("#name").val();
             let phone = $("#phone").val();
             let email = $("#email").val();
             let adress = $("#adress").val();
             let node = $("#node").val();
             let array = { id: id, name: name, phone: phone, email: email, address: adress, note: node };
             $.ajax({
                 type: "post",
                 url: "/updatecus",
                 data: array,

                 success: function (response) {
                     if (response == "true") {
                    	 
                    	 alert("Edit sucu");
                       
                     } else {
                         alter("khong thanh cong");
                     }
                 }
             });
         });
      $(".btn-danger").click(function(){
 
          if (confirm("You want to continue")) {
        	
              let id = data[item].id;
              let array = {
                  id: id
              }
              alert(id);
             $.ajax({
                  type: "post",
                  url: "/deletaCustommer",
                  data: array,

                  success: function (response) {
                      if (response == true) {
                          alert("Delete sus")
                          wwindow.location.reload;
                      }

                      else { }
                  }
              });
          } else { return false; }
       
      });

     })
    </script>
</body>

</html>