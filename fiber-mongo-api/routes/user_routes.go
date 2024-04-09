package routes

import (
    "fiber-mongo-api/controllers"

    "github.com/gofiber/fiber/v2"
    "net/http"
)

func UserRoute(app *fiber.App) {

    app.Options("/auth/register", func(c *fiber.Ctx) error {
        c.Response().Header.Set("Access-Control-Allow-Origin", "*")
        c.Response().Header.Set("Access-Control-Allow-Methods", "GET,POST,OPTIONS")
        return c.SendStatus(http.StatusOK)
    })
    app.Post("/auth/register", controllers.CreateUser)
    app.Post("/auth/login", controllers.LogUser)
	//app.Put("/user/:userId", controllers.EditAUser)
    app.Delete("/user/:userId", controllers.DeleteAUser)
    app.Get("/users", controllers.GetAllUsers)
}