package com.performance.module_2_224

class Feature224UseCase1(
    private val repository: Feature224Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
