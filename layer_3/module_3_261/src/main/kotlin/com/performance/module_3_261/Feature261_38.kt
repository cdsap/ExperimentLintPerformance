package com.performance.module_3_261

class Feature261UseCase2(
    private val repository: Feature261Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
