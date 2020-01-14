package uuid

// 推荐用Google uuid
import (
	"fmt"
	"testing"
)
import "github.com/google/uuid"

func TestUUID_Hex(t *testing.T) {
	id := uuid.New().String()
	fmt.Println(id)

	fmt.Println(uuid.New().String())
	fmt.Println(uuid.New().String())
	fmt.Println(uuid.New().String())

}
