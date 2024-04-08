package models

import "go.mongodb.org/mongo-driver/bson/primitive"

type User struct {
    Id 			primitive.ObjectID 	`json:"_id,omitempty"`
	Email			string				`json:"email,omitempty" validate:"required"`
    FirstName     	string             	`json:"firstName,omitempty" validate:"required"`
    LastName     	string             	`json:"lastName,omitempty" validate:"required"`
    Password 		string             	`json:"password,omitempty" validate:"required"`
    LastUpVote    	string             	`json:"lastUpVote,omitempty"`
	CreatedAt       string 				`json:"createdAt,omitempty"`
}