package com.performance.module_2_224

class Feature224UseCase2(
    private val repository: Feature224Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
