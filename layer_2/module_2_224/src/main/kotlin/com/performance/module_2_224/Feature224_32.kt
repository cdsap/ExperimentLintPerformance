package com.performance.module_2_224

class Feature224UseCase0(
    private val repository: Feature224Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
