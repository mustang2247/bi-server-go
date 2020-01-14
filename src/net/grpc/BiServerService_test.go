package BiService

import (
	pb "bi-server/proto/go"
	"context"
	"encoding/json"
	"google.golang.org/grpc"
	"log"
	"testing"
	"time"
)

const (
	address     = "localhost:9999"
)

type Person struct {
	Name   string
	Age    int
	Emails []string
}

func TestGrpc(t *testing.T) {
	// Set up a connection to the server.
	conn, err := grpc.Dial(address, grpc.WithInsecure(), grpc.WithBlock())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	defer conn.Close()
	c := pb.NewBiServiceClient(conn)

	// Contact the server and print out its response.

	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	data := Person{
		Name:   "Bingo Huang",
		Age:    30,
		Emails: []string{"go@bingohuang.com", "me@bingohuang.com"},
	}

	json, err := json.Marshal(data)
	if err != nil {
		panic(err)
	}
	//fmt.Printf("%s", json)

	r, err := c.Install(ctx, &pb.CommonRequest{MsgId: 0, Message: string(json)})
	if err != nil {
		log.Fatalf("could not greet: %v", err)
	}
	log.Println("Greeting: ", r.Code)
	log.Println("Greeting: ", r.Message)
	log.Println("Greeting: ", r.MsgId)
}