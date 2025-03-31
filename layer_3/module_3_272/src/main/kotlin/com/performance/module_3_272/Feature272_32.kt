package com.performance.module_3_272

class Feature272UseCase0(
    private val repository: Feature272Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
