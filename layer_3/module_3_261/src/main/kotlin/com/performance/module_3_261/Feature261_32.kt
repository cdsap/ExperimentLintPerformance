package com.performance.module_3_261

class Feature261UseCase0(
    private val repository: Feature261Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
