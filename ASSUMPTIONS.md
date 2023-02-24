# Assumptions

## Algorithm

I followed the Bottom up approach - We start from the nodes on the bottom row; 
- the minimum path sum for the bottom row nodes are the values of the nodes themselves. 
- the minimum path sum at each upper level for each node is the node value + the minimum of the *path sum* of its children.

to implement this approach I chose to use foldRight to start from the bottom row.

## Data Structure

- I used a `Vector[Vector[Int]]` as a structure to represent the triangle since the merge method accessing elements by index and Vector is better than List with index ops.
- The minimum path is represented as case class `Path(total: Int, nodes: List[Int])` that holds the minimum path sum and a list of path Nodes. Here I used a `List` and not a `Vector` cause only do a pre-append ops and List is a better data structure.


