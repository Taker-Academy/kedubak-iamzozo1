package configs

import (
	"time"

	"github.com/dgrijalva/jwt-go"
)

type Claims struct {
	UserID    string    `json:"userId"`
	IssuedAt  time.Time `json:"iat"`
	ExpiresAt time.Time `json:"exp"`
}

// Valid implements jwt.Claims.
func (c *Claims) Valid() error {
	panic("unimplemented")
}

func CreateJWTToken(id string) (string, error) {

	secretKey := "this_is_my_secret_key"

	now := time.Now()
	claims := &Claims{
		UserID:    id,
		IssuedAt:  now,
		ExpiresAt: now.Add(time.Hour * 24),
	}

	token := jwt.NewWithClaims(jwt.SigningMethodHS256, claims)

	signedToken, err := token.SignedString([]byte(secretKey))
	if err != nil {
		return "", err
	}
	return signedToken, nil
}
