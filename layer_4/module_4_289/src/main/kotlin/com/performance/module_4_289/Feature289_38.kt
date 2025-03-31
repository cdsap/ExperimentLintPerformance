package com.performance.module_4_289

class Feature289UseCase2(
    private val repository: Feature289Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
