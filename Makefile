JXX = javac
JXXFLAGS = -d

build: 
	$(JXX) $(JXXFLAGS) ./projeto/out/production/projeto/ ./projeto/src/*

test:
	cd ./projeto/out/production/projeto/ && java Main

clean:
	rm -f projeto/out/production/projeto/*