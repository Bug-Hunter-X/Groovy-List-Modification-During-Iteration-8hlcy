```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    if (item == "someValue") {
      list.remove(index) // This will cause an issue
    }
  }
}

List<String> myList = ["someValue", "anotherValue", "someValue"]
myMethod(myList)
println myList
```