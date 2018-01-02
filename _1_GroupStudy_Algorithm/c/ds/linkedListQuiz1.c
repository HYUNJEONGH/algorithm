#include <stdio.h>

typedef struct Node {
	int Data;
	int Data2;
	struct Node* nextNode;
} Node;

int main()
{
	printf("sizeof(int): %lu, sizeof(node) : %lu, sizeof(node*) : %lu\n", sizeof(int), sizeof(Node), sizeof(Node*));

	return 0;
}
