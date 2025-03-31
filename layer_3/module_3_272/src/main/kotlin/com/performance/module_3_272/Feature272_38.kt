package com.performance.module_3_272

class Feature272UseCase2(
    private val repository: Feature272Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
