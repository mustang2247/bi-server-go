windows:
	CGO_ENABLED=0 GOOS=windows GOARCH=amd64 go build -o bi-server.exe main.go
mac:
	CGO_ENABLED=0 GOOS=darwin GOARCH=amd64 go build -o bi-server main.go
linux:
	CGO_ENABLED=0 GOOS=linux GOARCH=amd64 go build -o bi-server main.go
