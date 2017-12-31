#arrayStack: arrayStack.o
#arrayStack.o: arrayStack.c

CC = gcc
COMPILE = out/intermediate
OBJS 	=
OBJS 	+= $(COMPILE)/arrayStack.o
OBJS 	+= $(COMPILE)/linkedListQuiz1.o
OBJS 	+= $(COMPILE)/doublyLinkedList.o
OBJS 	+= $(COMPILE)/linkedList.o

#all: $(COMPILE)/arrayStack.o

test2: $(OBJS)
	@echo "included test2 routine"

$(COMPILE)/arrayStack.o: ds/arrayStack.c
$(COMPILE)/linkedListQuiz1.o: ds/linkedListQuiz1.c
$(COMPILE)/doublyLinkedList.o: ds/doublyLinkedList.c
$(COMPILE)/linkedList.o: ds/linkedList.c

#%.o: %.c
#	$(CC) -c $< -o $(COMPILE)/$@

#%.o: %.c
#	$(CC) -c $< -o $(COMPILE)/$@
