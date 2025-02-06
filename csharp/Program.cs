var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => "Hello World!");
app.MapGet("/log", (HttpContext context, string? name = "Guest") =>
{
    return Results.Ok($"Hello, {name}!");
});

app.Run();
