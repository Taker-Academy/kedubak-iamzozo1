package routes

import (
    "fiber-mongo-api/controllers"

    "github.com/gofiber/fiber/v2"
    "net/http"
)

func UserRoute(app *fiber.App) {

    app.Options("/auth/register", func(c *fiber.Ctx) error {
        return c.SendStatus(http.StatusOK) // Allow OPTIONS for registration
    })
    app.Post("/auth/register", controllers.CreateUser)
	app.Get("/user/:userId", controllers.GetAUser)
	//app.Put("/user/:userId", controllers.EditAUser)
    app.Delete("/user/:userId", controllers.DeleteAUser)
    app.Get("/users", controllers.GetAllUsers)
}