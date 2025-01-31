```groovy
def myMethod(List<String> list) {
  list = list.findAll { it != "someValue" }
}

List<String> myList = ["someValue", "anotherValue", "someValue"]
myMethod(myList)
println myList
```

**Explanation:**
Instead of directly modifying the list while iterating, we create a new list containing only elements that are not equal to "someValue".  This avoids index issues and provides a cleaner, safer solution.