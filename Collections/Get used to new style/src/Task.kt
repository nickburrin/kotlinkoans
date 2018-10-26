fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { s -> s.length }

    // Does the same thing as the 2 lines below:
    return groupsByLength.values.maxBy { group -> group.size }
    
    /*
    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.max()
    
    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
     */
}
