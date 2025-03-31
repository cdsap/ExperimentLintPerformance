package com.performance.module_4_289

class Feature289UseCase0(
    private val repository: Feature289Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
