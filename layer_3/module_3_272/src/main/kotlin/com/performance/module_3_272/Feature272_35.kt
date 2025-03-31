package com.performance.module_3_272

class Feature272UseCase1(
    private val repository: Feature272Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
