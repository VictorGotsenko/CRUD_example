@import org.example.hexlet.util.NamedRoutes
@import org.example.hexlet.dto.users.UsersPage;
@param UsersPage page

@template.layout.page(
    content = @`
        <a href="${NamedRoutes.buildUserPath()}">New User</a>

    <h1>Список Пользователей</h1>
    @if(page.getUsers().isEmpty())
        <p>Пока не добавлено ни одного пользователя</p>
    @else
        @for(var user : page.getUsers())
            <div>
                <a href="${NamedRoutes.userPath(user.getId())}">${user.getName()}</a>
            </div>
        @endfor
    @endif
`)
