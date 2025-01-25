<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Handling Example</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f9f9f9; color: #333; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh;">

    <div style="background-color: #fff; padding: 20px; border-radius: 10px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1); width: 100%; max-width: 400px;">
        <h2 style="text-align: center; color: #4CAF50;">Form Submission</h2>

        <form action="form.jsp" method="post" style="display: flex; flex-direction: column;">
            <label for="name" style="margin-bottom: 5px; font-weight: bold;">Name:</label>
            <input type="text" id="name" name="name" required style="padding: 8px; border: 1px solid #ccc; border-radius: 5px; margin-bottom: 15px;">

            <label for="age" style="margin-bottom: 5px; font-weight: bold;">Age:</label>
            <input type="number" id="age" name="age" required style="padding: 8px; border: 1px solid #ccc; border-radius: 5px; margin-bottom: 15px;">

            <input type="submit" value="Submit" style="background-color: #4CAF50; color: white; padding: 10px; border: none; border-radius: 5px; cursor: pointer; font-weight: bold;">
        </form>

        <%-- Display Submitted Information --%>
        <%
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            if (name != null && age != null) {
        %>
            <div style="margin-top: 20px; padding: 15px; background-color: #e8f5e9; border-radius: 5px; border: 1px solid #c8e6c9;">
                <h3 style="margin: 0; color: #388E3C;">Submitted Information:</h3>
                <p style="margin: 5px 0;"><strong>Name:</strong> <%= name %></p>
                <p style="margin: 5px 0;"><strong>Age:</strong> <%= age %></p>
            </div>
        <% } %>
    </div>

</body>
</html>
