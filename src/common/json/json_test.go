package json

import (
	"fmt"
	"github.com/vmihailenco/msgpack/v4"
	"testing"
)

func TestJson(t *testing.T) {
	type Item struct {
		Foo string
	}

	b, err := msgpack.Marshal(&Item{Foo: "bar"})
	if err != nil {
		panic(err)
	}

	var item Item
	err = msgpack.Unmarshal(b, &item)
	if err != nil {
		panic(err)
	}
	fmt.Println(item.Foo)
	// Output: bar
}
