package com.performance.module_4_289

class Feature289UseCase1(
    private val repository: Feature289Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
