package main

import (
    "fiber-mongo-api/configs"
    "fiber-mongo-api/routes"
    "github.com/gofiber/fiber/v2"
)

func main() {
    app := fiber.New()

	app.Use(func (c *fiber.Ctx) error {
		c.Response().Header.Set("Access-Control-Allow-Origin", "*")
		c.Response().Header.Set("Access-Control-Allow-Methods", "GET,POST,OPTIONS")
		c.Response().Header.Set("Access-Control-Allow-Origin", "Content-Type,Authorization")
	
		return c.Next()
	})

    //run database
    configs.ConnectDB()

    //routes
    routes.UserRoute(app)

    app.Listen(":8080")
}