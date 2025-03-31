package com.performance.module_3_257

class Feature257UseCase2(
    private val repository: Feature257Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
