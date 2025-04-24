@import org.example.hexlet.util.NamedRoutes
@param gg.jte.Content content

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Validations Example</title>
</head>
<body>
  <main>
      <p>
        <a href="/">Main</a>
        <a href="${NamedRoutes.usersPath()}">Users</a>
      </p>
      ${content}
    </main>
  </body>
</html>

